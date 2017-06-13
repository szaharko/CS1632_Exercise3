import static org.junit.Assert.*;

import org.junit.*;

public class LaboonCoinTest {

    // Assert that creating a new LaboonCoin instance
    // does not return a null reference
    @Test
    public void testLaboonCoinExists() {
	LaboonCoin l = new LaboonCoin();
	assertNull(l);
    }
	
	//TESTING METHOD HASH()
	
		//Happy path -- send in a small string and get its hash
		
		@Test
		public void testSmallHash() {
			LaboonCoin l = new LaboonCoin();
			int testHash1 = l.hash("hi");
			assertSame(1825828625,testHash1);
		}
	
		//Empty Test -- send in an empty string
		
		@Test
		public void testEmptyHash() {
			LaboonCoin l = new LaboonCoin();
			int testHash2 = l.hash("");
			assertNull(testHash2);
		}
		
		//Large Test -- send in a large string
		
		@Test
		public void testLargeHash() {
			LaboonCoin l = new LaboonCoin();
			int testHash3 = l.hash("supercalifragilisticexpialidocious");
			assertSame(2035526292,testHash3);
		}
	
	//TESTING METHOD VALIDHASH()
	
		//Happy Path -- Pass in a valid hash with difficulty of 3
		
		@Test
		public void testValidHash() {
			LaboonCoin l = new LaboonCoin();
			boolean testValidHash1 = l.validHash(3,1428150834);
			assertTrue(testValidHash1);
		}
		
		//Empty Hash -- Pass in a hash of 0 with difficulty of 3
		
		@Test
		public void testEmptyValidHash() {
			LaboonCoin l = new LaboonCoin();
			boolean testValidHash2 = l.validHash(3,0);
			assertFalse(testValidHash2);
		}
		
		//Large Difficulty -- Pass in an invalid hash with a large difficulty
		
		@Test
		public void testLargeDiff() {
			LaboonCoin l = new LaboonCoin();
			boolean testValidHash3 = l.validHash(30,1428150834);
			assertFalse(testValidHash3);
		}
	
	
	//TESTING METHOD CREATEBLOCK()
	
		//Happy Path -- Enter valid data for all parameters
		
		@Test
		public void validBlock() {
			LaboonCoin l = new LaboonCoin();
			String testBlock1 = l.createBlock("boo", 00000000, 1428150834, 1428150834);
			assertSame("boo|00000000|1428150834|1428150834",testBlock1);
		}
		
		//Negative Param -- Enter data with a negative param
		
		@Test
		public void blockNegativeParam() {
			LaboonCoin l = new LaboonCoin();
			String testBlock2 = l.createBlock("boo", 00000000, 1428150834, -1428150834);
			assertSame("boo|00000000|1428150834|1428150834",testBlock2);
		}
		
		//Special chars -- Enter data with the string including special characters
		@Test
		public void blockSpecialChars() {
			LaboonCoin l = new LaboonCoin();
			String testBlock3 = l.createBlock("&*@^$!%*@&%@^", 00000000, 1428150834, 1428150834);
			assertSame("&*@^$!%*@&%@^|00000000|1428150834|1428150834",testBlock3);
		}
	
	
	//TESTING METHOD GETBLOCKCHAIN()
	
	//Happy Path -- Create a valid block chain and attempt to get it
	@Test
	public void getValidBlock() {
		LaboonCoin l = new LaboonCoin();
		String blockChain1 = l.createBlock("boo", 00000000, 1428150834, 1428150834);
		String getBlockChain1 = l.getBlockChain();
		assertSame("boo|00000000|1428150834|1428150834", getBlockChain1);
	}
	
	//Empty Blockchain -- Do not create a block chain and attempt to get it
	@Test
	public void getEmptyBlockChain() {
		LaboonCoin l = new LaboonCoin();
		String getBlockChain2 = l.getBlockChain();
		assertNull(getBlockChain2);
	}
	
	//Large Blockchain -- create a very large block chain and attempt to get it
	@Test
	public void getLargeBlockChain() {
		LaboonCoin l = new LaboonCoin();
		l.createBlock("boo", 00000000, 1428150834, 1428150834);
		l.createBlock("boo", 00000000, 1428150834, 1428150834);
		l.createBlock("boo", 00000000, 1428150834, 1428150834);
		l.createBlock("boo", 00000000, 1428150834, 1428150834);
		l.createBlock("boo", 00000000, 1428150834, 1428150834);
		l.createBlock("boo", 00000000, 1428150834, 1428150834);
		l.createBlock("boo", 00000000, 1428150834, 1428150834);
		l.createBlock("boo", 00000000, 1428150834, 1428150834);
		l.createBlock("boo", 00000000, 1428150834, 1428150834);
		l.createBlock("boo", 00000000, 1428150834, 1428150834);
		l.createBlock("boo", 00000000, 1428150834, 1428150834);
		l.createBlock("boo", 00000000, 1428150834, 1428150834);
		l.createBlock("boo", 00000000, 1428150834, 1428150834);
		l.createBlock("boo", 00000000, 1428150834, 1428150834);
		l.createBlock("boo", 00000000, 1428150834, 1428150834);
		l.createBlock("boo", 00000000, 1428150834, 1428150834);
		l.createBlock("boo", 00000000, 1428150834, 1428150834);
		l.createBlock("boo", 00000000, 1428150834, 1428150834);
		l.createBlock("boo", 00000000, 1428150834, 1428150834);
		l.createBlock("boo", 00000000, 1428150834, 1428150834);
		l.createBlock("boo", 00000000, 1428150834, 1428150834);
		l.createBlock("boo", 00000000, 1428150834, 1428150834);
		l.createBlock("boo", 00000000, 1428150834, 1428150834);
		l.createBlock("boo", 00000000, 1428150834, 1428150834);
		l.createBlock("boo", 00000000, 1428150834, 1428150834);
		l.createBlock("boo", 00000000, 1428150834, 1428150834);
		l.createBlock("boo", 00000000, 1428150834, 1428150834);
		l.createBlock("boo", 00000000, 1428150834, 1428150834);
		l.createBlock("boo", 00000000, 1428150834, 1428150834);
		String getBlockChain3 = l.getBlockChain();
		assertSame("boo|00000000|1428150834|1428150834\n boo|00000000|1428150834|1428150834\n boo|00000000|1428150834|1428150834\n boo|00000000|1428150834|1428150834\n boo|00000000|1428150834|1428150834\n boo|00000000|1428150834|1428150834\n boo|00000000|1428150834|1428150834\n boo|00000000|1428150834|1428150834\n boo|00000000|1428150834|1428150834\n boo|00000000|1428150834|1428150834\n boo|00000000|1428150834|1428150834\n boo|00000000|1428150834|1428150834\n boo|00000000|1428150834|1428150834\n boo|00000000|1428150834|1428150834\n boo|00000000|1428150834|1428150834\n boo|00000000|1428150834|1428150834\n boo|00000000|1428150834|1428150834\n boo|00000000|1428150834|1428150834\n boo|00000000|1428150834|1428150834\n boo|00000000|1428150834|1428150834\n boo|00000000|1428150834|1428150834\n boo|00000000|1428150834|1428150834\n boo|00000000|1428150834|1428150834\n boo|00000000|1428150834|1428150834\n boo|00000000|1428150834|1428150834\n boo|00000000|1428150834|1428150834\n boo|00000000|1428150834|1428150834\n boo|00000000|1428150834|1428150834\n boo|00000000|1428150834|1428150834\n ",getBlockChain3);
	}
	
	
    
}