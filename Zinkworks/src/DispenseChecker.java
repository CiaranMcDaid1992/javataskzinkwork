public class DispenseChecker {
    public static void main(String[] args) {

        // Setup a sample run.  This bank's ATMs typically have 20's, 50's, 100's and 500's
        int[] intNotes = {500, 100, 50, 20};

        // Check every amount between 0 and 1000 incrementally by 10 to see if the ATM could dispense that amount.
        // Display the amounts that can't be dispensed.
        for (int i = 0; i <= 1000; i = i + 10) {
            if (!canDispenseInit(intNotes, i)) {
                System.out.println(i + " : false");
            }
        }
    }

    /// <summary>Executes the canDispense method incrementally. </summary>
    /// <param name="intNotes">Integer array of the money denominations that the bank commonly has in each ATM. </param>
    /// <param name="intAmountToDispense">
    /// Integer representing the amount that the customer wants to withdrawal.</param>
    /// <returns>True or False depending on whether or not the requested value can be dispensed by the bills listed.</returns>
    /// <remarks></remarks>
    public static boolean canDispenseInit(int[] intNotes, int intAmountToDispense) {
        for (int x = 0; x < intNotes.length; x++) {
            if (canDispense(intNotes, intAmountToDispense, x)) {
                return true;
            }
        }
        return false;
    }

    /// <summary> Iterates through the notes to see if the amount requested can be provided in those bills </summary>
    /// <param name="intNotes">Integer array of the money denominations that the bank commonly has in each ATM.</param>
    /// <param name="intAmountToDispense">Integer representing the amount that the  customer wants to withdrawal.</param>
    /// <param name="intStartAt">The element of the intNotes array with which to begin the loop.</param>
    /// <returns>True or False depending on whether or not the requested value can be
    /// dispensed by the bills listed.</returns>
    /// <remarks>
    /// *** This method should not be called directly! It should only be called by the canDispenseInit method.
    /// </remarks>
    private static boolean canDispense(int[] intNotes, int intAmountToDispense, int intStartAt) {
        for (int x = intStartAt; x < intNotes.length; x++) {
            if (intAmountToDispense >= intNotes[x]) {
                int intMod = intAmountToDispense % intNotes[x];

                if (intMod == 0) {
                    return true;
                }
                else {
                    return canDispense(intNotes, intMod, x++);
                }
            }
            else {
                // Amount is less than this denomination.
            }
        }

        // Tried them all in this set, and it won't work.
        return false;
    }
}
