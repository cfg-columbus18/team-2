package com.ohioguidestone.team2;

import java.util.*;
import java.util.Random;

public class ActivityRecs
{
    public static void main(String[] args)
    {
        int [] ans = new int[5];

        //social

        HashMap<Integer, List<String>> arraySocial = new HashMap<>();

        arraySocial.put(0, Arrays.asList(new String[] {"Call someone you care about", "Visit your local library",
                "Go to a community event", "Spend time with friends", "Hug someone you're close to",
                "Reconnect with someone you haven't talked to in a while", "Do something nice for someone"}));

        arraySocial.put(1, Arrays.asList(new String[] {"Call someone you care about", "Visit your local library",
                "Go to a community event", "Spend time with friends", "Hug someone you're close to",
                "Reconnect with someone you haven't talked to in a while", "Do something nice for someone"}));

        arraySocial.put(2, Arrays.asList(new String[] {"Call someone you care about", "Do something nice for someone"}));

        arraySocial.put(3, Arrays.asList(new String[] {"Call someone you care about", "Spend time with friends",
                "Hug someone you're close to", "Reconnect with someone you haven't talked to in a while",
                "Do something nice for someone"}));

        arraySocial.put(4, Arrays.asList(new String[] {"Call someone you care about"}));

        //relazationg

        HashMap<Integer, List<String>> arrayRelax = new HashMap<>();

        arrayRelax.put(0, Arrays.asList(new String[] {"Meditate", "Listen to music", "Art (open ended)", "Spend time outside",
                "Write in your journal", "Take a deep breath", "Tidy up your living space"}));

        arrayRelax.put(1, Arrays.asList(new String[] {"Meditate", "Listen to music", "Art (open ended)", "Spend time outside",
                "Write in your journal", "Take a deep breath"}));

        arrayRelax.put(2, Arrays.asList(new String[] {"Meditate", "Listen to music", "Art (open ended)",
                "Write in your journal", "Take a deep breath"}));

        arrayRelax.put(3, Arrays.asList(new String[] {"Meditate", "Listen to music", "Art (open ended)", "Spend time outside",
                "Write in your journal", "Take a deep breath", "Tidy up your living space"}));

        arrayRelax.put(4, Arrays.asList(new String[] {"Meditate", "Listen to music", "Art (open ended)",
                "Write in your journal", "Take a deep breath"}));


        //beHuman

        HashMap<Integer, List<String>> arrayHuman = new HashMap<>();

        arrayHuman.put(0, Arrays.asList(new String[] {"Go for a walk", "Eat a fruit", "Take a nap",
                "Drink a cup of water", "Eat a balanced meal", "Take a shower", "Play a sport"}));

        arrayHuman.put(1, Arrays.asList(new String[] {"Go for a walk", "Eat a fruit", "Take a nap",
                "Drink a cup of water", "Eat a balanced meal", "Take a shower", "Play a sport"}));

        arrayHuman.put(2, Arrays.asList(new String[] {"Eat a fruit", "Take a nap",
                "Drink a cup of water", "Eat a balanced meal", "Take a shower"}));

        arrayHuman.put(3, Arrays.asList(new String[] {"Go for a walk", "Eat a fruit", "Take a nap",
                "Drink a cup of water", "Eat a balanced meal", "Take a shower"}));

        arrayHuman.put(4, Arrays.asList(new String[] {"Eat a fruit", "Take a nap",
                "Drink a cup of water", "Eat a balanced meal"}));

        int returnedVal[];
        returnedVal = findMax(ans);

        List<String> socialActivity = arraySocial.get(returnedVal[0]);
        List<String> relaxActivity = arrayRelax.get(returnedVal[1]);
        List<String> humanActivity = arrayHuman.get(returnedVal[2]);

        Random rand = new Random();

        String social1 = socialActivity.get(rand.nextInt(socialActivity.size()-1));
        String relax1 = relaxActivity.get(rand.nextInt(relaxActivity.size()-1));
        String human1 = humanActivity.get(rand.nextInt(humanActivity.size()-1));

        int  n = rand.nextInt(3) + 1;

        String [] r = new String [2];



        if (n == 1)
        {
            r[0] = social1;
            r[1] = relax1;
        }
        else if (n == 2)
        {
            r[0] = social1;
            r[1] = human1;
        }
        else
        {
            r[0] = human1;
            r[1] = relax1;
        }

        System.out.println(r[0]);
        System.out.println(r[1]);


    }


    public static int[] findMax(int[] arr)
    {
        int first = 0;
        int second = 0;
        int third = 0;

        for (int i = 0; i < 5 ; i ++)
        {
        /* If current element is smaller than
        first*/
            if (arr[i] > first)
            {
                third = second;
                second = first;
                first = arr[i];
            }

        /* If arr[i] is in between first and
        second then update second  */
            else if (arr[i] > second)
            {
                third = second;
                second = arr[i];
            }

            else if (arr[i] > third)
                third = arr[i];
        }

        int returnValue[] = new int [3];
        returnValue[0] = first;
        returnValue[0] = second;
        returnValue[0] = third;

        return returnValue;


    }

}
