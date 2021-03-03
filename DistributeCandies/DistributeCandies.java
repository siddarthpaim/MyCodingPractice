public class DistributeCandies {

    public int distributeCandies(int[] candyType) {

        int uniqueCandies = 0;

        for (int i = 0; i < candyType.length; i++) {

            boolean isUnique = true;

            for (int j = 0; j < i; j++) {

                if (candyType[i] == candyType[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueCandies++;
            }
        }

        return Math.min(uniqueCandies, candyType.length / 2);

    }

}
