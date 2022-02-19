                                //Происходит загрузка классов. Подсистема загрузчиков классов анализирует код и дает
                                // задание на загрузку класса "JvmComprehension" в память. Далее идет проверка на наличие
                                // данного класса в базовой библиотеке Bootstrap ClassLoader, вслучае присутствия класса
                                // "JvmComprehension" в базовой библиотеке, он загружается оттуда, в противном случае
                                // роисходит проверкана на наличие класса "JvmComprehension" в платформенной библиотеке
public class JvmComprehension { // Platform ClassLoader, вслучае присутствия класса "JvmComprehension" в платформенной
                                // библиотеке,он загружается оттуда, в противном случае происходит проверкат на наличие
                                // класса "JvmComprehension" в библиотеке приложения Application ClassLoader, вслучае
                                // присутствия класса "JvmComprehension" в библиотеке приложения, он загружается оттуда,
                                // в противном случае выводиться ошибка ClassNotFoundException "Класс не найден".
                                // Загрузка данных в классе происходит в область памяти Metaspace.


    public static void main(String[] args) { // Начинает загружаться метод main, под него в стеке (Stack Memory)
                                            // выделяется объем памяти.

        int i = 1;                      // В стеке в выделенной под метод "main" области создается переменная "i" и в
                                        // нее записывается ее значение.

        Object o = new Object();        // В куче (Heap) выделяется необходимое количество памяти и записывается объект
                                        // "Object". В стеке в выделенной под метод "main" области создается переменная
                                        // "o" и в нее записывается ссылка на объект "Object" в куче (Heap).

        Integer ii = 2;                 // В куче (Heap) выделяется необходимое количество памяти и записывается объект
                                        // "Integer". В стеке в выделенной под метод "main" области создается переменная
                                        // "ii" и в нее записывается ссылка на объект "Integer" в куче (Heap).

        printAll(o, i, ii);             // Начинает загружаться метод printAll, под него в стеке (Stack Memory)
                                        // выделяется объем памяти. В стеке в выделенной под метод "printAll" области
                                        // создаются переменные "о", "i" "ii". В переменные "о" и "ii" записываются ссылки
                                        // на объект "Object" и "Integer" находящиеся в куче (Heap), а в переменную "i"
                                        // записывается ее значение.
                                        // После выполнения метода printAll и обработкой сборщиком мусора объекты
                                        // "Object", "Integer" и "String"(созданный при выполнении метода printAll) будут
                                        //удалены из кучи, т.к. не используются.

        System.out.println("finished"); // Начинает загружаться метод System.out.println, под него в стеке (Stack Memory)
                                        // выделяется объем памяти. В куче (Heap) создается объект "String", на который
                                        // ссылается переменная, созданная в стеке (Stack Memory).
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                              // В куче (Heap) выделяется необходимое количество памяти
                                                               // и записывается объект "Integer". В стеке в выделенной
                                                               // под метод printAll области создается переменная
                                                               // "uselessVar" и в нее записывается ссылка на объект
                                                               // "Integer" в куче (Heap). После обработки сборщиком
                                                               // мусора будет удален из кучи т.к. не используется.



        System.out.println(o.toString() + i + ii); // Начинает загружаться метод System.out.println, под него в стеке
                                                   //(Stack Memory) выделяется объем памяти. В стеке в выделенной под
                                                   // метод "System.out.println" области создаются переменные "i" "ii".
                                                   // В переменную "ii" записывается ссылка на объект "Integer" находящийся
                                                   // в куче (Heap), а в переменную "i" записывается ее значение. В куче
                                                   // (Heap) создается новый объект "String", на который ссылается
                                                   // переменная "str"(например), созданная в стеке в области, выделенной
                                                   // под метод System.out.println . Начинает загружаться метод toString,
                                                   // под него в стеке (Stack Memory) выделяется объем памяти. В стеке в
                                                   // выделенной под метод toString области создаются переменные "o" и
                                                   //"str"(например). В переменную "o" записывается ссылкана объект
                                                   //"Object" из кучи, а в переменную "str" записывается ссылка на объект
                                                   // "String" из кучи. Результат работы метода toString записывается в
                                                   // объект "String" из кучи по ссылке, указанной в переменной "str".
    }
}
