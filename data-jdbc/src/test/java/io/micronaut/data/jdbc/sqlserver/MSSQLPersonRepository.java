package io.micronaut.data.jdbc.sqlserver;

import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.tck.repositories.PersonRepository;

@JdbcRepository(dialect = Dialect.SQL_SERVER)
public interface MSSQLPersonRepository extends PersonRepository {

}
