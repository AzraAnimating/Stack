import java.util.*;
public class Stack<ContentType>
{
    private class StackNode
    {
        private ContentType content = null;
        private StackNode previousNode = null;
        public StackNode(ContentType pContent)
        {
            content = pContent;
            previousNode = null;
        }
        public void setLast(StackNode pLast)
        {
            previousNode = pLast;
        }
        public StackNode getLast()
        {
            return previousNode;
        }
        public ContentType getContent()
        {
            return content;
        }
    }
    private StackNode head;
    private StackNode lastNode;
    public Stack()
    {
       head = null;
    }
    public boolean isEmpty()
    {
        if(head != null)
        {
            return true;
        } 
        else 
        {
            return false;
        }
    }
    public void setLast(StackNode pNode)
    {
        lastNode = pNode;
    }
    public StackNode getLast(){
        return lastNode;
    }
    public void push(ContentType pContent)
    {
        if(pContent  != null)
        {
            StackNode newNode = new StackNode(pContent);
            if(this.isEmpty())
            {
                head = newNode;
                this.setLast(newNode);
            }
            else
            {
                try 
                {
                    head.setLast(this.getLast());
                } 
                catch (Exception e)
                {
                    head.setLast(newNode);
                }
                head = newNode;
            }
        }
    }
}
