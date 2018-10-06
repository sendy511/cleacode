package cleancode.meaningfulnames;

public class AddMeaningfulContextDemo {
    // Bad one
    public void printGuessStattistics(int count, String candidate){
        String verb = null;
        String pluralModifier = "s";
        String quantity = count + "";

        if( count == 0 ){
            verb = "are";
            quantity = "None";
        } else if( count == 1){
            verb = "is";
            pluralModifier = "";
        } else {
            verb = "are";
        }

        System.out.println(String.format("There %s %s %s%s", verb, quantity, candidate, pluralModifier));
    }

    //Good one
    class GuessStatisticMessage{
        String verb = null;
        String pluralModifier = "s";
        String quantity;

        public void make(int count, String candidate){
            createPluralDependentMessageParts(count, candidate);
            System.out.println(String.format("There %s %s %s%s", verb, quantity, candidate, pluralModifier));
        }

        private void createPluralDependentMessageParts(int count) {
            if (count == 0) {
                thereAreNoLetters();
            } else if( count == 1 ){
                thereIsOneLetters();
            } else {
                thereAreManyLetters(count);
            }
        }

        private void thereAreManyLetters(int count) {
            verb = "are";
            pluralModifier = "s";
            quantity = Integer.toString(count);
        }

        private void thereIsOneLetters() {
            verb = "is";
            pluralModifier = "";
            quantity = "1";
        }

        private void thereAreNoLetters() {
            verb = "are";
            pluralModifier = "s";
            quantity = "none";
        }
    }
}
