USE [db_teacher]
GO
/****** Object:  Table [dbo].[tb_info]    Script Date: 12/17/2017 19:30:21 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tb_info](
	[id] [int] NOT NULL,
	[name] [nvarchar](32) NOT NULL,
	[age] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tb_emplyee]    Script Date: 12/17/2017 19:30:21 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tb_emplyee](
	[id] [tinyint] NOT NULL,
	[name] [nvarchar](32) NOT NULL,
	[salary] [money] NULL,
	[dateline] [date] NULL,
	[recommend] [bit] NULL,
	[department] [nvarchar](16) NULL,
	[remarks] [ntext] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Table_1]    Script Date: 12/17/2017 19:30:21 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Table_1](
	[id] [int] NOT NULL,
	[name] [nvarchar](50) NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Default [DF__tb_emplye__salar__060DEAE8]    Script Date: 12/17/2017 19:30:21 ******/
ALTER TABLE [dbo].[tb_emplyee] ADD  DEFAULT ((3000)) FOR [salary]
GO
/****** Object:  Default [DF__tb_info__age__014935CB]    Script Date: 12/17/2017 19:30:21 ******/
ALTER TABLE [dbo].[tb_info] ADD  DEFAULT ((18)) FOR [age]
GO
