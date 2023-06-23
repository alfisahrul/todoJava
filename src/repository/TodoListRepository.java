package repository;

import entity.Todolist;

public interface TodoLustRepository
{
    Todolist[]  getAll();

    void add(Todolist todolist);

    void remove(Integer number);


}
