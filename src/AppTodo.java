import java.util.Scanner;

public class AppTodo {

    public static  java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static  String[] data = new String[10];
    public static void main(String[] args) {

        viewShowTodoList();

    }

    /*
        Show todo list
     */
    public static void showTodoList() {
        System.out.println(" TO DO LIST");
       for (int i = 0 ; i < data.length; i++){
           var todo = data[i];
           var no = i + 1;

           if (todo != null){
               System.out.println(no+ ". "+ todo);
           }
       }
    }

    public static void testShowTodoList(){
        data[0]  = "Java todo list";
        data[1] = "App java";
        showTodoList();
    }

    public static void testAddTodoList(){
        for (int i = 0; i <=25;i++){
            addTodoList("Contoh todo ke-" + i);
        }
        showTodoList();
    }

    public static void testRemoveTodoList(){
        addTodoList("one");
        addTodoList("two");
        addTodoList("three");
        addTodoList("four");
        addTodoList("five");

        var result = removeTodolist(20);
        System.out.println(result);

        result = removeTodolist(7);
        System.out.println(result);

        result = removeTodolist(2);
        System.out.println(result);

        showTodoList();
    }

    public static boolean removeTodolist(Integer number){
        if ((number-1) >= data.length){
            return false;
        }
        if (data[number -1] == null){
            return false;
        }else {
            for (int i = (number-1); i < data.length;i++){
                if (i==(data.length-1)){
                    data[i] = null;
                }else {
                    data[i] = data[i+1];
                }

            }

            return true;
        }

    }

    public static void addTodoList(String todo) {

        var isFull = true;
        for (int i = 0;i< data.length;i++){
            if(data[i]==null){
                isFull = false;
                break;
            }
        }
        if (isFull){
            var temp = data;

            data = new String[data.length *2];

            for (int i = 0 ; i< temp.length; i++){
                data[i] = temp[i];
            }
        }

        for(var i = 0 ; i< data.length; i++){
            if (data[i]==null){
                data[i] = todo;
                break;
            }
        }
    }
        /*
         * view todoList
         */

    public static String input(String info){
        System.out.print(info +" : ");
        String inputan = scanner.nextLine();
        return inputan;
    }

    public static void  testInput(){
        var nama = input("Nama");
        System.out.println("Hi "+ nama);
    }

    public static void viewShowTodoList(){
        while (true){
            showTodoList();
            System.out.println("Menu");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("0. Keluar");

            var input = input(" Masukan Pilihan ");
            if (input.equals("1")){
                viewAddTodoList();

            } else if (input.equals("2")) {
                viewRemoveTodoList();


            } else if (input.equals("0")){
                break;
            } else {
                System.out.println("Pilihan tidak dimengerti");
            }
        }
    }

    public static void testViewsShowTodoList(){

        addTodoList("one");
        addTodoList("two");
        addTodoList("three");
        addTodoList("four");
        addTodoList("five");

        viewShowTodoList();

    }

    public static void viewAddTodoList(){
        System.out.println("Menambah TODO");
        var  todo = input("0 untuk batal");

        if (todo.equals("0")){
            //batal
        }
        else {
            addTodoList(todo);
        }

    }

    public static void testViewAddTodoList(){
        addTodoList("satu satu");

        viewAddTodoList();

        showTodoList();
    }
    public static void viewRemoveTodoList(){
        System.out.println("Menghapus todo List : ");

        var  number = input("0 untuk batal");

        if (number.equals("0")){
            //batal
        }
        else {
            boolean succes = removeTodolist(Integer.valueOf(number));
            if (!succes){
                System.out.println("Gagal menambah todo "+ number);
            }
        }



    }

    public static void testViewRemoveTodoList(){
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");

        showTodoList();
        viewRemoveTodoList();

        showTodoList();
    }
}