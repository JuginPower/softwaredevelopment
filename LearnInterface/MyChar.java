package LearnInterface;

public class MyChar implements Commentable, Flagable {
    
    private boolean flag = false;
    private char theChar;
    private String comment;

    public MyChar(char c) {
        this.theChar = c;
    }

    @Override
    public void resetFlag() {
        this.flag = false;
    }

    @Override
    public void setFlag() {
        this.flag = true;
    }

    @Override
    public boolean getFlag() {
        return this.flag;
    }

    @Override
    public String getComment() {
        return this.comment;
    }

    @Override
    public void setComment(String newComment) {
        this.comment = newComment;
    }

    @Override
    public void clearComment() {
        this.comment = null;
    }
}
