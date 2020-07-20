using Xunit;

public class testclass
{
    [Fact]
    public void Passing()
    {
        Assert.Equal(4, NETPharmacy.Program.Add(2,2));
    }
}