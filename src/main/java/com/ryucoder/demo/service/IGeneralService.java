package com.ryucoder.demo.service;

import java.util.List;

public interface IGeneralService<E> {
    List<E> findAll();

    E findById(Long id);

    void remove(Long id);

    E add(E e);

    E update(E e);
}
