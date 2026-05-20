
function FacebookLikeSytem(String[] names){
                
    const users = names[].length
    const manyUsers = users -2;
    if(users == 0){
        return "no user like this ";
    }
    if(users == 1){
        return `${names[0]} +" like this`;
    }else if(users == 2){
        return `${names[0]}+ "and" + ${names[]} + like this`;

    }else if(users == 3){
        return`${names[0]} and ${names[1]} ${names[2]} like this`;
    }else if(users == 4){
        return `${names[0]} and ${names[1]}  and ${manyUsers} others like this`;

}
