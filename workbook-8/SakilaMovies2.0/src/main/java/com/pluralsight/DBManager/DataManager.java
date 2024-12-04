package com.pluralsight.DBManager;

import Models.Actor;
import Models.Film;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private DataSource dataSource;

    public DataManager(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Actor> getActorByLastNameRequest(String lastName) throws SQLException {
        List<Actor> actors = new ArrayList<>();
        String actorsQuery = """
                SELECT actor_id,first_name,last_name
                FROM actor
                WHERE actor_id = ?
                """;

        try (Connection connect = dataSource.getConnection();
             PreparedStatement actorsStatement = connect.prepareStatement(actorsQuery)) {
            actorsStatement.setString(3, lastName);

            try (ResultSet results = actorsStatement.executeQuery()) {
                while (results.next()) {
                    {
                        int actorID = results.getInt(1);
                        String firstName = results.getString(2);
                        String theActorLastName = results.getString(3);

                        Actor actor = new Actor(actorID, firstName, theActorLastName);
                        actors.add(actor);

                    }
                }
            } catch (SQLException ex) {
                System.err.println("Notice! in request for actor ERROR occurred");
                ex.printStackTrace();
            }
            return actors;
        }
    }

    public List<Film> getFilmsByActorId(int actorId) {
        List<Film> films = new ArrayList<>();

        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(
                     "SELECT film.film_id, film.title, film.description, film.release_year, film.length " +
                             "FROM film " +
                             "JOIN film_actor ON film.film_id = film_actor.film_id " +
                             "WHERE film_actor.actor_id = ?")) {
            statement.setInt(1, actorId);

            try (ResultSet results = statement.executeQuery()) {
                while (results.next()) {
                    int filmId = results.getInt("film_id");
                    String title = results.getString("title");
                    String description = results.getString("description");
                    int releaseYear = results.getInt("release_year");
                    int length = results.getInt("length");

                    Film film = new Film(filmId, title, description, releaseYear, length);
                    films.add(film);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return films;
    }
}
