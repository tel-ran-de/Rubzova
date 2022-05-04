class MySimpleList { // поезд, опознаем поезд по адрессу который храниться в переменной head

    class Node { // вагон поезда на котором написано info
        int info;
        Node next;
        Node(int info) {
            this.info = info;
            next = null;
        } // constructor
    } // Node

    Node head;// адресс начала нашего поезда


    MySimpleList() {// поезд в начале пустой
        head = null;
    } // constructor .

    void addToHead(int info){
        Node tmp = new Node(info);
        tmp.next = head;
        head = tmp;
    } // addToHead()

    void addToTail(int info){
        Node tmp;
        tmp = new Node(info);
        if (head != null) {
            Node item = head;
            while (item.next != null){
                item = item.next;
            } // while
            item.next = tmp;
        } // if
        else {
            head = tmp;
        }
    } // addToTail


    boolean addAfterElement(int after, int info){
        if (head != null){
            Node item = head;
            while ((item != null)&&(item.info != after)){
                item = item.next;
            } // while
            if (item != null){
                Node tmp = new Node(info);
                tmp.next = item.next;
                item.next = tmp;
                return true;
            }// if item != null
        }// if head != null
        return false; // элемент не нашелся
    } // addAfterElement

    boolean addBeforeElement(int before, int info){
        if (head != null){
            if (head.info == before){
                addToHead(info);
                return true;
            } // if head.info == before
            Node item = head;
            while ((item.next != null) && (item.next.info != before)){// шагаю за один узел до нужного  элемента
                                                                    // 12 9 7 3 (нужна 7 отановлюсь на 9)
                item = item.next;
            } // while
            if (item.next != null){
                Node tmp = new Node(info);
                tmp.next = item.next;
                item.next = tmp;
                return true;
            } // if item.next != null
        } // if head != null
        return false; // элемент не найден
    }// addBeforeElement

    void removeFromHead(){
        if (head != null) {
            Node tmp = head;
            head = tmp.next;
            tmp = null; // возможно, это излишне
        } //if — а иначе удалять нечего
    } // removeFromHead

    void removeFromTail(){
        if (head != null) {
            if (head.next == null){
                head = null;
                return;
            }
            Node item = head;
            Node nextItem = item.next;
            while (nextItem.next != null){
                item = nextItem;
                nextItem = nextItem.next;
            }
            item.next = null; // разрываем связь
            nextItem = null;
        } // if
    } // removeFromTail
    boolean removeFirstInfo(int info){
        if (head != null){
            Node item = head;
            Node tmp;
            if (head.info == info) {
                removeFromHead();
                return true;
            } //if head.info == info
            while ((item.next !=null) && (item.next.info != info)){
                item = item.next;
            }
            if (item.next != null){
                tmp = item.next;
                item.next = item.next.next; // перебрасываем ссылку
                tmp = null;
                return true;
            } // if item.next != null
        }// if head != null
        return false;
    } // removeFirstInfo


    Node searchFirstInfo(int info){
        Node res = head;
        while ((res != null) && (res.info != info)) {
            res = res.next;
        } // while
        return res;
    } // searchFirstInfo

   // подсчитывает количество отрицательных элементов в списке
   int count(){
       Node tmp = head;
       int kol = 0;
       while (tmp != null){
           if (tmp.info < 0){
               kol += 1;
           }
           tmp = tmp.next;
       } // while
       return kol;
   }

    // вычисляет среднее арифметическое элементов списка
    double count0() {
        Node tmp = head;
        int kol = 0;
        int s = 0;
        while (tmp != null) {
            kol += 1;
            s += tmp.info;
            tmp = tmp.next;
        } // while
        return s / kol;
    }

    // подсчитывает сумму положительных элементов в списке
   int pol(){
       Node tmp = head;
       int s = 0;
       while (tmp != null){

           if (tmp.info > 0){
               s += tmp.info;
           }
           tmp = tmp.next;
       } // while
       return s;
   }// printListOneString


    void printListOneString(){
        Node tmp = head;
        while (tmp != null){
            System.out.print(tmp.info + " ");
            tmp = tmp.next;
        } // while
    }// printListOneString

}

public class Jadn {
    public static void main(String[] args) {
        MySimpleList poezd = new MySimpleList() ; //поезд по умолчанию пустой
        poezd.addToHead(7);
        poezd.addToHead(9);
        poezd.addToHead(-12);
        poezd.addToTail(-3);
        poezd.addBeforeElement(7,1);
        poezd.removeFirstInfo(55);
        poezd.printListOneString();
        System.out.println();
        System.out.println("Количество отрицательных "+poezd.count());
        System.out.println("Сумма положительных "+poezd.pol());


    }


}
