const _ = {
    inRange: (n: number): number[] => {
        return [...Array(n).keys()].slice(1);
    }
};

export default _;
