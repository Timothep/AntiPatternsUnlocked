import { isGreater } from "./BooleanReturn";

describe("isGreater", ()=>{
    it("should return true for a>b", ()=>{
        expect(isGreater(2,1)).toBeTrue();
    })

    it("should return false for a<b", ()=>{
        expect(isGreater(1,2)).toBeFalse();
    })
})