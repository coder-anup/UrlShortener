package com.dash.anup.UrlShortner.service;

import com.dash.anup.UrlShortner.model.Url;
import com.dash.anup.UrlShortner.model.UrlDto;
import org.springframework.stereotype.Service;

@Service
public interface UrlService {
    Url generateShortLink(UrlDto urlDto);
    Url persistShortLink(Url url);
    Url getEncodedUrl(String url);
    void deleteShortLink(Url url);

}
