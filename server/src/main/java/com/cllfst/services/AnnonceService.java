package com.cllfst.services;

import com.cllfst.entities.Annonce;

import java.util.List;

public interface AnnonceService {
    Annonce lookup(String titreAd);

    void save(Annonce annonce);

    List <Annonce> getAll();
}
