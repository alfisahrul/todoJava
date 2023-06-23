package test.view;

import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;
import view.TodoListView;

public class TodoListServiceTest
{
    public static void  testShowTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListService.addTodoList("java oop");
        todoListService.addTodoList("java 2");
        todoListService.addTodoList("java 3");

        todoListView.showTodoList();
    }
    public static void main(String[] args)
    {
        testRemoveTodoList();
    }
    public static void  testAddTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);



        todoListView.addTodoList();
        todoListService.showTodoList();
    }

    public static void  testRemoveTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListService.addTodoList("java oop");
        todoListService.addTodoList("java 2");
        todoListService.addTodoList("java 3");


        todoListService.showTodoList();
        todoListView.removeTodoList();

        todoListService.showTodoList();
    }
}
