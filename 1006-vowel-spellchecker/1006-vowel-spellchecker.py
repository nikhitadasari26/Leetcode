from typing import List

class Solution:
    def spellchecker(self, wordlist: List[str], queries: List[str]) -> List[str]:
        vowels = set("aeiou")

        def devowel(word: str) -> str:
            return "".join('*' if c in vowels else c for c in word)

        exact = set(wordlist)
        case_map = {}
        vowel_map = {}

        for w in wordlist:
            low = w.lower()
            case_map.setdefault(low, w)
            vowel_map.setdefault(devowel(low), w)

        ans = []
        for q in queries:
            if q in exact:
                ans.append(q)
            else:
                low = q.lower()
                if low in case_map:
                    ans.append(case_map[low])
                else:
                    ans.append(vowel_map.get(devowel(low), ""))
        return ans
