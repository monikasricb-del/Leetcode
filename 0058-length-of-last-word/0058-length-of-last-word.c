int lengthOfLastWord(char* s) {
    int length=0;
    bool space = false;
    for(int i=strlen(s) - 1;i>=0;i--){
        if(s[i] != ' '){
            length++;
            space = true;
        }else if(space){
            break;
        }
    }
    return length;
}