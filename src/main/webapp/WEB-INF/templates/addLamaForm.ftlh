<div class="container">
    <h3>
        Create new user Lama:
    </h3>
    <div class="row">
        <div class="col"></div>
        <div class="col">
            <form method="post" action="/addLama" enctype="multipart/form-data">
                <div class="form-group">
                    <label for="name">Lama name</label>
                    <input type="text" class="form-control form-control-sm" name="name" placeholder="Enter name">
                </div>
                <div class="form-group">
                    <label for="login">Lama login</label>
                    <input type="text" class="form-control form-control-sm" name="login" placeholder="Enter login">
                </div>
                <div class="form-group">
                    <label for="password">Password</label>
                    <input type="password" class="form-control form-control-sm" name="password"  placeholder="Password">
                </div>
                <div class="form-group">
                    <label for="exampleFormControlFile1">Lama profile photo</label>
                    <input type="file" class="form-control-file form-control-sm" name="photoURL" >
                </div>
                <div class="form-group">
                    <label for="birthDate">Birth Date</label>
                    <input type="date" class="form-control form-control-sm" name="dateOfBirth"  placeholder="date">
                </div>
                <div class="form-group">
                    <label for="bio">Bio</label>
                    <textarea class="form-control form-control-sm" name="bio" rows="3"></textarea>
                </div>
                <button type="submit"  class="btn btn-primary">Add new Lama User</button>
            </form>


        </div>
        <div class="col"></div>
    </div>
</div>