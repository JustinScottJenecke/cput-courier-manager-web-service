package org.example.repository;
@Deprecated
public interface IRepository <Type, ID>{

    Type create(Type x);
    Type read(String ID);
    Type update(Type x, String ID);
    boolean delete(String ID);

    Type getAll(Type x);

}
