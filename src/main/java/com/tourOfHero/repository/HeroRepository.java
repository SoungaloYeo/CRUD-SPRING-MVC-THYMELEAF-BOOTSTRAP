package com.tourOfHero.repository;

import com.tourOfHero.entities.Hero;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by yeo-sglo on 20/03/17.
 */
public interface HeroRepository extends JpaRepository<Hero, Long> {
}
