package com.nassim.cloudinary.service;

import com.nassim.cloudinary.repository.ImageRepository;
import com.nassim.cloudinary.entity.Image;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ImageService {

    @Autowired
    ImageRepository imageRepository;

    public List<Image> list(){
        return imageRepository.findByOrderById();
    }

    public Optional<Image> getOne(int id){
        return imageRepository.findById(id);
    }

    public void save(Image image){
        imageRepository.save(image);
    }

    public void delete(int id){
        imageRepository.deleteById(id);
    }

    public boolean exists(int id){
        return imageRepository.existsById(id);
    }
}