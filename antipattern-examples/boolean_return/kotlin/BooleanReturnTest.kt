class BooleanReturnTest({
    @test fun f(){
        assertEquals(isGreater(2, 1), true)
    }
    @test fun f(){
        assertEquals(isGreater(1, 2), false)
    }
})