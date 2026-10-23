int comp(const void* a,const void* b){
    char *str1=*(char**)a;
    char *str2=*(char**)b;
    return strcmp(str1,str2);
}
char* longestCommonPrefix(char** strs, int strsSize) {
    qsort(strs,strsSize,sizeof(strs[0]),comp);
    if(strsSize == 0){
        return "";
    }
    char *first=strs[0];
    char *last=strs[strsSize - 1];
    
    int i=0;
    while(first[i]!='\0' && first[i] == last[i]){
        i++;
    }
    char *res=(char*)malloc((i+1)*sizeof(char));
    strncpy(res,first,i);
    res[i]='\0';
    return res;
}