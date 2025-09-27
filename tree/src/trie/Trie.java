package trie;

public class Trie
{
    class Node
    {
        Node[] children;
        boolean eof;
        public Node()
        {
            children = new Node[26];
            eof=false;
        }
    }
    Node root;

    public Trie()
    {
        root=new Node();

    }

    public void insert(String s)
    {
        s=s.toLowerCase();
        Node curr = root;
        for(int i=0;i<s.length();i++)
        {
            int x = (int)(s.charAt(i)-'a');
            if(curr.children[x]==null)curr.children[x]=new Node();
            curr=curr.children[x];
        }
        curr.eof=true;
    }

    public boolean search(String s)
    {
        s=s.toLowerCase();
        Node curr = root;
        for(int i=0;i<s.length();i++)
        {
            int x = (int)(s.charAt(i)-'a');
            if(curr.children[x]==null) return false;
            curr=curr.children[x];
        }
        if(curr.eof) return true;
        return false;
    }




}
