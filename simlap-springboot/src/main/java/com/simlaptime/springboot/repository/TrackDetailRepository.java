package com.simlaptime.springboot.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

import com.simlaptime.springboot.model.TrackDetail;


public interface TrackDetailRepository extends JpaRepository<TrackDetail, Long>{

    List<TrackDetail> findByName(String name);
    
}
