package Search.Homework2;

import java.util.ArrayList;

public class Subset {
    static void printSubsets(String set1[])
    {
        int n = set1.length;
        for (int i = 0; i < (1<<n); i++)
        {
            System.out.print("{ ");
            for (int j = 0; j < n; j++)
                if ((i & (1 << j)) > 0)
                    System.out.print(set1[j] + " ");

            System.out.print("}, ");
        }
    }

    static ArrayList<ArrayList<String> > getSubset(String[] set, int index)
    {
        ArrayList<ArrayList<String> > allSubsets;
        if (index < 0) {
            allSubsets = new ArrayList<ArrayList<String> >();
            allSubsets.add(new ArrayList<String>());
        }

        else {
            allSubsets = getSubset(set, index - 1);
            String item = set[index];
            ArrayList<ArrayList<String> > moreSubsets
                    = new ArrayList<ArrayList<String> >();

            for (ArrayList<String> subset : allSubsets) {
                ArrayList<String> newSubset = new ArrayList<String>();
                newSubset.addAll(subset);
                newSubset.add(item);
                moreSubsets.add(newSubset);
            }
            allSubsets.addAll(moreSubsets);
        }
        return allSubsets;
    }
    public static void main(String[] args)
    {
        String[] set = { "a", "b", "c" };

        int index = set.length - 1;
        ArrayList<ArrayList<String> > result = getSubset(set, index);
        System.out.println(result);


        System.out.println();
        System.out.println("接下來使用非遞迴");


        String set1[] = {"A", "B", "C","D"};
        printSubsets(set1);
    }


}
