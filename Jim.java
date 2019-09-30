public class Jim{
        public static void main(String[] args){
        int age = 40;
        int wages = 700;
        int kids = 8;
        int potentialWage = 800;
        double score = 27.5;
        String name = "Jim";
        String occupation = "Plumber";
        String wageFrequency = "week";
        String maritalStatus = "divorced";
        String grade = "failed";

        String output;

        output = name+" is a "+age+" year old man. Life is tough on "+name+". He works as a "+occupation+".";
        output += "He is "+maritalStatus+" and has "+kids+" children.";
        output += "He earns "+wages+" a "+wageFrequency+" but needs "+potentialWage+" a "+wageFrequency+" to support his ex wife and children.";

        output += "He was hoping to pass an exam which would enable him to earn more, but unfortunately";
        output += "poor "+name+" "+grade+" it witjh a score of "+score;

        System.out.println(output);
        }
}