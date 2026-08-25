<<<<<<< HEAD
package com.i27academy.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.i27academy.dashboard.model.Service;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Long> {
    boolean existsByName(String name);
}
=======
package com.i27academy.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.i27academy.dashboard.model.Service;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Long> {
    boolean existsByName(String name);
}
>>>>>>> 61dd7a58fe97e44741826fb6f5a74a85d5700ff1
