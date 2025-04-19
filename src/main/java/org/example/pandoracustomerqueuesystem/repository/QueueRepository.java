package org.example.pandoracustomerqueuesystem.repository;

import org.springframework.jdbc.core.JdbcTemplate;

public class QueueRepository {

    private JdbcTemplate jdbcTemplate;

    public QueueRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }



}
