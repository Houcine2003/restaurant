package com.houcine.Restauramt.respositories;

import com.houcine.Restauramt.domain.entities.Restaurant;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

public interface RestaurantRepository extends ElasticsearchRepository<Restaurant, String> {

}
