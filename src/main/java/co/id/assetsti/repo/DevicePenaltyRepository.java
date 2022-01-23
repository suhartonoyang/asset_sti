package co.id.assetsti.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.id.assetsti.model.DevicePenalty;

@Repository
public interface DevicePenaltyRepository extends JpaRepository<DevicePenalty, Integer> {

}
