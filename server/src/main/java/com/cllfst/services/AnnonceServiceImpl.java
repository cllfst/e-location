package com.cllfst.services;


import com.cllfst.dao.AnnonceRepository;
import com.cllfst.entities.Annonce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class AnnonceServiceImpl implements AnnonceService {

    @Autowired(required = true)
    private AnnonceRepository annonceRepository;

    public AnnonceServiceImpl(){

    }

    @Override
    public Annonce lookup(String titreAd) {

        return annonceRepository.findById(titreAd).get();
    }

    @Override
    public void save(Annonce annonce) {

        annonceRepository.save(annonce);
    }

    @Override
    public List<Annonce> getAll(){
        return annonceRepository.findAll();
    }

}

