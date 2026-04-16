class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> id;
        for(int i = 0; i < nums.size(); i++){
            id[nums[i]] = i;
        }
        for(int i = 0; i < nums.size(); i++){
            int diff = target - nums[i];
            if(id.count(diff) && id[diff] != i){
                return {i, id[diff]};
            }
        }
        return {};
    }
};
