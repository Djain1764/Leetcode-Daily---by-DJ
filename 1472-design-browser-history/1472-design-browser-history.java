class Linknode {
    String val ;
    Linknode next ;
    Linknode prev ;
    
    public Linknode(String val){
        this.val = val ;
    }
}

class BrowserHistory {
    
    Linknode root ;
    public BrowserHistory(String homepage) {
        root = new Linknode(homepage) ;
    }
    
    public void visit(String url) {
        root.next = new Linknode(url) ;
        root.next.prev = root ;
        root = root.next ;
    }
    
    public String back(int steps) {
        while(steps > 0){
            if(root.prev != null)
                root = root.prev ;
            steps-- ;
        }
        return root.val ;
    }
    
    public String forward(int steps) {
        while(steps > 0){
            if(root.next != null)
                root = root.next ;
            steps-- ;
        }
        return root.val ;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */