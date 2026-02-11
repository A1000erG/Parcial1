import java.time.LocalTime;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.io.*;

public class Main{
    public class PrintJob{
        private String user = new String("");
        private char priority = 'L';
        private int pages = 0;
        PrintJob(){
            user = "local";
        }
        PrintJob(String user, char priority, int pages){
            this.user = user;
            this.priority = priority;
            this.pages = pages;
        }

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public char getPriority() {
            return priority;
        }

        public void setPriority(char priority) {
            this.priority = priority;
        }

        public int getPages() {
            return pages;
        }

        public void setPages(int pages) {
            this.pages = pages;
        }
    }
    public class Node{
        private PrintJob data = new PrintJob();
        private Node next = null;
        private Node prev = null;

        Node(PrintJob data, Node prev, Node next){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public PrintJob getData() {
            return data;
        }

        public void setData(PrintJob data) {
            this.data = data;
        }
    }
    public class PrintQueqe{
        private Node cab;
        private Node actual;
        PrintQueqe(){
            cab = null;
            actual = null;
        }
        public void enqueue(PrintJob job){
            if(job!=null) {
                if (cab == null) {
                    cab = new Node(job, null, null);
                } else if (actual == null) {
                    actual = new Node(job, cab, null);
                    cab.setNext(actual);
                } else {
                    Node temp = actual;
                    actual.setData(job);
                    actual.setPrev(temp);
                }
            }
        }
        public Node dequeue(){
            Node dev = null;
            if(isEmpty()){
                isEmpty();
            }else{
                dev = actual;
                actual = actual.getPrev();
                actual.setNext(null);
            }
            return dev;
        }
        public boolean isEmpty(){
            boolean flag = false;
            if(cab==null && actual==null){
                IO.println("empty list");
                flag = true;
            }
            else{
                IO.println("list not empty");
            }
            return flag;
        }

    }
    public class PrintService{
        Node headH = null;
        Node headM = null;
        Node headL = null;
        public void submitJob(PrintJob job){
            if()
        }
        public void processNext(){

        }
        public void processAll(){

        }
    }
    public class PrintManager{

    }

}