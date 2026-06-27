class Solution {
    public boolean rotateString(String s, String goal) {
        goal+=goal;
        return goal.contains(s);
    }
}