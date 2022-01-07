package co.id.assetsti.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.id.assetsti.model.DeviceRented;

@Repository
public interface DeviceRentedRepository extends JpaRepository<DeviceRented, Integer> {

}
