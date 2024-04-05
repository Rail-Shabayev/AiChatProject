package org.rail.repository;

import org.rail.model.Request;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface RequestRepository extends CrudRepository<Request, UUID> {
}
