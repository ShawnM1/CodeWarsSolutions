using System;
using Counting_Duplicates;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace CountingDuplicatesTest
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void KataTests()
        {
            Assert.AreEqual(0, Program.DuplicateCount(""));
            Assert.AreEqual(0, Program.DuplicateCount("abcde"));
            Assert.AreEqual(2, Program.DuplicateCount("aabbcde"));
            Assert.AreEqual(2, Program.DuplicateCount("aabBcde"), "should ignore case");
            Assert.AreEqual(1, Program.DuplicateCount("Indivisibility"));
            Assert.AreEqual(2, Program.DuplicateCount("Indivisibilities"), "characters may not be adjacent");
        }
    }
}
