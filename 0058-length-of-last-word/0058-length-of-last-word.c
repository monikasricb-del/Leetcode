int lengthOfLastWord(char* s) {
    int count=0;
    bool space=false;
    for(int i=strlen(s)-1;i>=0;i--){
        if(s[i]!=' '){
            count++;
            space=true;
        }
        else if(space){
            break;
        }
    }
    return count;
}