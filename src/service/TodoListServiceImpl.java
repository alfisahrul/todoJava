package service;

import entity.Todolist;
import repository.TodoListRepository;

public class TodoListServiceImpl implements TodoListService
{
    private TodoListRepository todoListRepository;

    public TodoListServiceImpl(TodoListRepository todoListRepository)
    {
        this.todoListRepository = todoListRepository;
    }



    @Override
    public void showTodoList()
    {
        System.out.println(" TO DO LIST");
        Todolist[]  data = todoListRepository.getAll();
        for (int i = 0 ; i < data.length; i++){
            var todolist = data[i];
            var no = i + 1;

            if (todolist != null){
                System.out.println(no+ ". "+ todolist.getTodo());
            }
        }
    }

    @Override
    public void addTodoList(String todo)
    {
        Todolist todolist = new Todolist(todo);
        todoListRepository.add(todolist);

        System.out.println("Sukses menambah todo"+ todo);

    }

    @Override
    public void removeTodoList(Integer number)
    {
        boolean success = todoListRepository.remove(number);
        if(success)
        {
            System.out.println("Sukses menghapus"+ number);
        }else
        {
            System.out.println("Gagal menghapus"+ number);
        }

    }
}
