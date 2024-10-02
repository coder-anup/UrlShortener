package com.dash.anup.UrlShortner.repository;

import com.dash.anup.UrlShortner.model.Url;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlRepository extends JpaRepository<Url,Long> {
    Url findByShortLink(String shortLink);
}
