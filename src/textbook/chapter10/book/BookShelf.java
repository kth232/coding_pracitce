package textbook.chapter10.book;


public class BookShelf extends Shelf implements Queue {
    @Override
    public String enQueue(String title) {
        shelf.add(title); //배열 요소 추가
        return title;
    }

    @Override
    public String deQueue() {
        return shelf.remove(0); //맨 처음 요소 arrayList에서 삭제하고 반환
    }

    @Override
    public int getSize() {
        return getCount(); //배열 요소 개수 반환
    }
}
