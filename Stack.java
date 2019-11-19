public class Stack<ContentType> {

    private class StackNode {

        private ContentType content = null;
        private StackNode nextNode = null;
        private StackNode lastNode = null;

        public StackNode(ContentType pContent) {
            content = pContent;
            nextNode = null;
        }

        public void setLast(StackNode pLast){
            lastNode = pLast;
        }
        public StackNode getLast(){
            return lastNode;
        }

        public void setNext(StackNode pNext) {
            nextNode = pNext;
        }

        public StackNode getNext() {
            return nextNode;
        }


        public ContentType getContent() {
            return content;
        }
        public StackNode getObject(){
            return this;
        }

    }


    private StackNode top;
    private StackNode previousNode;


    public Stack() {
        top = null;
        previousNode = null;
    }

    public boolean isEmpty() {
        return top == null;
    }


    public void push(ContentType pContent) {

        if(pContent != null){
            StackNode newNode = new StackNode(pContent);
            if(this.isEmpty()){
                top = newNode;
                previousNode = newNode;
            } else {
                newNode.setLast(previousNode);
                previousNode.setNext(newNode);
                top = newNode;
                previousNode = top;
            }
        }
    }

    public void pop() {
        if (!this.isEmpty()) {
            top = top.getLast();
            previousNode = top;
            if(top != null){
                previousNode.setNext(null);
            }
            if (this.isEmpty()) {
                top = null;
            }
        }
    }

    public ContentType getTop() {
        if (this.isEmpty()) {
            return null;
        } else {
            return top.getContent();
        }
    }
}
