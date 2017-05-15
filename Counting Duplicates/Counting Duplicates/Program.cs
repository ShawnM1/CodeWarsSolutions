using System;
using System.Collections.Generic;
namespace Counting_Duplicates
{
    public class Program
    {
            
        public static void Main(String[] args)
        {
           // Console.WriteLine(DuplicateCount("aabbcde"));
            Console.WriteLine(DuplicateCount("aabBcde"));
            Console.WriteLine(DuplicateCount("Indivisibilities"));
            Console.ReadLine();
        }
        public static int DuplicateCount(string str)
        {
            int count = 0;
            IDictionary<Char, Int32> map = new Dictionary<char, int>();
            str = str.ToLower();
            char[] characters = str.ToCharArray();
            foreach(char ch in characters)
            {
                if (!map.ContainsKey(ch))
                {
                    map[ch] = 1;
                } else
                {
                    int occurences = map[ch];
                    occurences++;
                    map[ch] = occurences;
                }
            }

            foreach (KeyValuePair<char, Int32> entry in map)
            {
                if (entry.Value > 1)
                {
                    count++;
                }
            }

            return count;
        }

    }
}