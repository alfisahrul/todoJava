package view;

import service.TodoListService;
import util.InputUtil;

public class TodoListView
{
    private TodoListService todoListService;

    public TodoListView(TodoListService todoListService)
    {
        this.todoListService = todoListService;
    }

    public void showTodoList()
    {

        while (true){
            todoListService.showTodoList();
            System.out.println("Menu");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("0. Keluar");

            var input = InputUtil.input(" Masukan Pilihan ");
            if (input.equals("1")){
                addTodoList();

            } else if (input.equals("2")) {
                removeTodoList();


            } else if (input.equals("0")){
                break;
            } else {
                System.out.println("Pilihan tidak dimengerti");
            }
        }

    }

    public void addTodoList()
    {
        System.out.println("Menambah TODO");
        var  todo = InputUtil.input("0 untuk batal");

        if (todo.equals("0")){
            //batal
        }
        else {
            todoListService.addTodoList(todo);
        }

    }

    public void removeTodoList()
    {
        System.out.println("Menghapus todo List : ");

        var  number = InputUtil.input("0 untuk batal");

        if (number.equals("0")){
            //batal
        }
        else {
          todoListService.removeTodoList(Integer.valueOf(number));

        }



    }
}
