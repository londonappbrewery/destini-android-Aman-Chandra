package com.londonappbrewery.destini;

public class check {

    private int storyId, choice1, choice2, nextStory1, nextStory2;

    public check(int sId, int c1, int c2, int ns1, int ns2){
        storyId = sId;
        choice1 = c1;
        choice2 = c2;
        nextStory1 = ns1;
        nextStory2 = ns2;
    }

    public int getStoryId() {
        return storyId;
    }

    public void setStoryId(int storyId) {
        this.storyId = storyId;
    }

    public int getChoice1() {
        return choice1;
    }

    public void setChoice1(int choice1) {
        this.choice1 = choice1;
    }

    public int getChoice2() {
        return choice2;
    }

    public void setChoice2(int choice2) {
        this.choice2 = choice2;
    }

    public int getNextStory1() {
        return nextStory1;
    }

    public void setNextStory1(int nextStory1) {
        this.nextStory1 = nextStory1;
    }

    public int getNextStory2() {
        return nextStory2;
    }

    public void setNextStory2(int nextStory2) {
        this.nextStory2 = nextStory2;
    }
}
